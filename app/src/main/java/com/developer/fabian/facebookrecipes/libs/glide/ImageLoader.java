package com.developer.fabian.facebookrecipes.libs.glide;

import android.widget.ImageView;

import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;

public class ImageLoader implements IImageLoader {

    private RequestManager glideRequestManager;
    private RequestListener onFinishedLoadingListener;

    public ImageLoader(RequestManager glideRequestManager) {
        this.glideRequestManager = glideRequestManager;
    }

    @Override
    public void load(ImageView imageView, String URL) {
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop();

        if (onFinishedLoadingListener != null)
            glideRequestManager
                    .load(URL)
                    .apply(options)
                    .listener(onFinishedLoadingListener)
                    .into(imageView);
        else
            glideRequestManager
                    .load(URL)
                    .apply(options)
                    .into(imageView);
    }

    @Override
    public void setOnFinishedImageLoadingListener(Object listener) {
        if (listener instanceof RequestListener)
            this.onFinishedLoadingListener = (RequestListener) listener;
    }
}
