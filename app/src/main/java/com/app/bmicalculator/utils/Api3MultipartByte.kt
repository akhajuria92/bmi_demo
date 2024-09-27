package com.app.bmicalculator.utils

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileNotFoundException

class Api3MultipartByte {
    private var progressRequestBody: ProgressRequestBody? = null
    private var builder: MultipartBody.Builder? = null

    init {
        builder = MultipartBody.Builder().setType(MultipartBody.FORM)
    }


    fun put(key: String, value: String) {
        builder!!.addFormDataPart(key, value)
    }

    fun putFileGetByte(key: String, featured_image: File?) {
        if (featured_image != null && featured_image.exists()) {
            if (featured_image.exists()) { // If you want to use Bitmap then use this
                val bmp: Bitmap = BitmapFactory.decodeFile(featured_image.absolutePath)
                val bos = ByteArrayOutputStream()
                bmp.compress(Bitmap.CompressFormat.JPEG, 30, bos)
                builder!!.addFormDataPart(
                    key,
                    featured_image.name,
                    bos.toByteArray().toRequestBody(MultipartBody.FORM)
                )
            }
        } else {
            throw FileNotFoundException()
        }
    }

    fun getImageBase64(featured_image: File): String {
        if (featured_image.exists()) { // If you want to use Bitmap then use this
            val bmp: Bitmap = BitmapFactory.decodeFile(featured_image.absolutePath)
            val bos = ByteArrayOutputStream()
            bmp.compress(Bitmap.CompressFormat.JPEG, 30, bos)
            return Base64.encodeToString(bos.toByteArray(), Base64.DEFAULT)
        } else {
            throw FileNotFoundException()
        }
    }

    fun put(key: String, file: File?) {
        if (file != null && file.exists()) {
            builder!!.addFormDataPart(
                key,
                file.name,
                file.asRequestBody("multipart/form-data".toMediaTypeOrNull())
            )
        } else {
            throw FileNotFoundException()
        }

    }

    fun put(key: String, file: File?, listener: ProgressRequestBody.UploadProgressListener) {
        if (file != null && file.exists()) {
            progressRequestBody = ProgressRequestBody(file, "multipart/form-data", listener)
            builder!!.addFormDataPart(
                key,
                file.name,
                progressRequestBody!!
            )
        } else {
            throw FileNotFoundException()
        }

    }

    fun cancelRequest() {
        progressRequestBody!!.cancel()
    }

    fun put(key: String, body: RequestBody) {
        builder!!.addFormDataPart(
            key,
            "",
            body
        )
    }


    fun getRequestBody(): RequestBody {
        return builder!!.build()
    }


}

