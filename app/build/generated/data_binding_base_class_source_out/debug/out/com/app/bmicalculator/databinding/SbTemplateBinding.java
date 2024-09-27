// Generated by view binder compiler. Do not edit!
package com.app.bmicalculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.bmicalculator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SbTemplateBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final TextView sbAction;

  @NonNull
  public final View sbDivider;

  @NonNull
  public final LinearLayout sbInner;

  @NonNull
  public final TextView sbText;

  private SbTemplateBinding(@NonNull View rootView, @NonNull TextView sbAction,
      @NonNull View sbDivider, @NonNull LinearLayout sbInner, @NonNull TextView sbText) {
    this.rootView = rootView;
    this.sbAction = sbAction;
    this.sbDivider = sbDivider;
    this.sbInner = sbInner;
    this.sbText = sbText;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static SbTemplateBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.sb__template, parent);
    return bind(parent);
  }

  @NonNull
  public static SbTemplateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.sb__action;
      TextView sbAction = ViewBindings.findChildViewById(rootView, id);
      if (sbAction == null) {
        break missingId;
      }

      id = R.id.sb__divider;
      View sbDivider = ViewBindings.findChildViewById(rootView, id);
      if (sbDivider == null) {
        break missingId;
      }

      id = R.id.sb__inner;
      LinearLayout sbInner = ViewBindings.findChildViewById(rootView, id);
      if (sbInner == null) {
        break missingId;
      }

      id = R.id.sb__text;
      TextView sbText = ViewBindings.findChildViewById(rootView, id);
      if (sbText == null) {
        break missingId;
      }

      return new SbTemplateBinding(rootView, sbAction, sbDivider, sbInner, sbText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
