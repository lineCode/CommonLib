package me.suanmiao.common.ui.mvc.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by suanmiao on 14-12-3.
 */
public abstract class BaseView {

    private View contentView;

    public BaseView(Context context, ViewGroup contanier) {
        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        contentView = inflater.inflate(getLayoutId(), contanier, false);
        findView();
    }

    public View getContentView() {
        return contentView;
    }

    public abstract int getLayoutId();

    public abstract void findView();

    public <T> T findViewById(int id, Class<T> classOfT) {
        return (T) contentView.findViewById(id);
    }
}