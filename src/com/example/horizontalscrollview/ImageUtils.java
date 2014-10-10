package com.example.horizontalscrollview;

import android.content.Context;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

/**
 * 2014-8-18 by heliangwei
 */

public class ImageUtils {
	private static boolean isConfiged = false;

	/**
	 * 获得Imageloader对象，封装配置的过程（根据Imageloader的文档，应该统一配置）
	 * 
	 * @param context
	 * @return 2014-8-18
	 */
	public static ImageLoader getImageLoader(Context context) {
		if (!isConfiged) {
			ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
					.threadPriority(Thread.NORM_PRIORITY - 2).denyCacheImageMultipleSizesInMemory()
					.diskCacheFileNameGenerator(new Md5FileNameGenerator()).diskCacheSize(50 * 1024 * 1024) // 50 Mb
					.tasksProcessingOrder(QueueProcessingType.LIFO).writeDebugLogs() // Remove for release app
					.build();
			ImageLoader.getInstance().init(config);
			isConfiged = true;
		}
		return ImageLoader.getInstance();
	}

	public static DisplayImageOptions getDefaultImageOptions() {
		// TODO: 添加图片加载过程对应的图片
		return new DisplayImageOptions.Builder().showImageOnFail(R.drawable.pic_normal)
				.showImageForEmptyUri(R.drawable.pic_normal).cacheInMemory(true).cacheOnDisk(true)
				.considerExifParams(true).bitmapConfig(Bitmap.Config.RGB_565).build();
	}
}
