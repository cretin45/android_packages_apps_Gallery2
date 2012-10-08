/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.gallery3d.util;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.android.camera.CameraModule;
import com.android.gallery3d.app.GalleryApp;
import com.android.gallery3d.app.StitchingProgressManager;
import com.android.gallery3d.data.MediaSource;

public class LightCycleHelper {

    public static void setupCaptureIntent(Context context, Intent it, String outputDir) {
        /* Do nothing */
    }

    public static boolean hasLightCycleView(Context context) {
        return false;
    }

    public static boolean hasLightCycleCapture(Context context) {
        return false;
    }

    public static void viewPanorama(Activity activity, Uri uri) {
        /* Do nothing */
    }

    public static boolean isPanorama(ContentResolver contentResolver, Uri uri) {
        return false;
    }

    public static boolean isPanorama360(Context context, Uri uri) {
        return false;
    }

    public static CameraModule createPanoramaModule() {
        return null;
    }

    public static StitchingProgressManager createStitchingManagerInstance(GalleryApp app) {
        return null;
    }

    public static MediaSource createMediaSourceInstance(GalleryApp app) {
        return null;
    }

    public static String wrapGalleryPath(String path) {
        return path;
    }
}
