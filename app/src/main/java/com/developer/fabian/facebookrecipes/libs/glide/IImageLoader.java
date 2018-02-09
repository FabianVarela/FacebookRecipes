package com.developer.fabian.facebookrecipes.libs.glide;

import android.widget.ImageView;

public interface IImageLoader {
    void load(ImageView imageView, String URL);

    void setOnFinishedImageLoadingListener(Object listener);
}
