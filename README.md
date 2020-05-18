## APK差分合并

## 如何引入
### Gradle引入
### step 1
Add the JitPack repository to your build file

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2
Add the dependency

```
dependencies {
    implementation 'com.github.lwugang:ApkDiff:v1.0'
}

```
### ApkDiff
        通过oldFile和patch包合并生成新的文件
```java
        // 旧apk文件
        File oldApkPath = new File(Environment.getExternalStorageDirectory(), "oldApk.apk");
        //新生成的文件
        File newApkPath = new File(Environment.getExternalStorageDirectory(), "newApk.apk");
        // 差分包，通过服务端生成下发
        File patchFile = new File(Environment.getExternalStorageDirectory(), "patch.patch");
        // oldApk和patch合并生成新的apk
        int ret = DiffUtils.patch(oldApkPath.getAbsolutePath(), newApkPath.getAbsolutePath(), patchFile.getAbsolutePath());
```

## License

   	Copyright 2018 lwy

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
