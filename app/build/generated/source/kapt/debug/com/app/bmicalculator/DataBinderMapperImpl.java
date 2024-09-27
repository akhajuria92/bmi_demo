package com.app.bmicalculator;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.bmicalculator.databinding.ActivityMainBindingImpl;
import com.app.bmicalculator.databinding.ActivitySplashBindingImpl;
import com.app.bmicalculator.databinding.AdapterBmiResultBindingImpl;
import com.app.bmicalculator.databinding.AdapterDashBoardBindingImpl;
import com.app.bmicalculator.databinding.FragmentCalculateBmiBindingImpl;
import com.app.bmicalculator.databinding.FragmentHomeBindingImpl;
import com.app.bmicalculator.databinding.FragmentResultBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYSPLASH = 2;

  private static final int LAYOUT_ADAPTERBMIRESULT = 3;

  private static final int LAYOUT_ADAPTERDASHBOARD = 4;

  private static final int LAYOUT_FRAGMENTCALCULATEBMI = 5;

  private static final int LAYOUT_FRAGMENTHOME = 6;

  private static final int LAYOUT_FRAGMENTRESULT = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.bmicalculator.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.bmicalculator.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.bmicalculator.R.layout.adapter_bmi_result, LAYOUT_ADAPTERBMIRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.bmicalculator.R.layout.adapter_dash_board, LAYOUT_ADAPTERDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.bmicalculator.R.layout.fragment_calculate_bmi, LAYOUT_FRAGMENTCALCULATEBMI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.bmicalculator.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.bmicalculator.R.layout.fragment_result, LAYOUT_FRAGMENTRESULT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ADAPTERBMIRESULT: {
          if ("layout/adapter_bmi_result_0".equals(tag)) {
            return new AdapterBmiResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for adapter_bmi_result is invalid. Received: " + tag);
        }
        case  LAYOUT_ADAPTERDASHBOARD: {
          if ("layout/adapter_dash_board_0".equals(tag)) {
            return new AdapterDashBoardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for adapter_dash_board is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCALCULATEBMI: {
          if ("layout/fragment_calculate_bmi_0".equals(tag)) {
            return new FragmentCalculateBmiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_calculate_bmi is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRESULT: {
          if ("layout/fragment_result_0".equals(tag)) {
            return new FragmentResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_result is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "handleClick");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.app.bmicalculator.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", com.app.bmicalculator.R.layout.activity_splash);
      sKeys.put("layout/adapter_bmi_result_0", com.app.bmicalculator.R.layout.adapter_bmi_result);
      sKeys.put("layout/adapter_dash_board_0", com.app.bmicalculator.R.layout.adapter_dash_board);
      sKeys.put("layout/fragment_calculate_bmi_0", com.app.bmicalculator.R.layout.fragment_calculate_bmi);
      sKeys.put("layout/fragment_home_0", com.app.bmicalculator.R.layout.fragment_home);
      sKeys.put("layout/fragment_result_0", com.app.bmicalculator.R.layout.fragment_result);
    }
  }
}
