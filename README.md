# LoadView
android loadview是一个可以灵活自定义并且可以结合第三方动画解耦的库，使用起来也是超级方便
## 演示
- 这里除了默认loading动画，还集成了第三方动画库作为演示，比如很火的[lottie-android](https://github.com/airbnb/lottie-android),还有其他比较优秀的动画，比如[LoadingView](https://github.com/ldoublem/LoadingView)，详情见demo
 <img width="300"  src="https://github.com/gyf-dev/Screenshots/blob/master/LoadView/loadview.gif"/>
 
## 下载demo 
### [下载](https://github.com/gyf-dev/LoadView/tree/master/apk/loadview-debug.apk) 
 
## 使用 
> android studio

   ```groovy
   implementation 'com.gyf.loadview:loadview:1.0.2'
   ```
## 用法
### 简单用法
- 使用一，默认加载Loading是ProgressBar圆形样式，可以通过属性修改颜色，默认是colorAccent颜色，如果想使用其他Loading样式请看使用二
 ```xml
   <com.gyf.loadview.LoadView
       android:id="@+id/load_view"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       app:load_image_height="100dp"
       app:load_image_width="100dp"
       app:load_loading_height="100dp"
       app:load_loading_width="100dp"
       app:load_current_status="undo"/>
   ```
- 使用二
> 在xml中自定义loading样式
```xml
   <com.gyf.loadview.LoadView
       android:id="@+id/load_view"
       android:layout_width="match_parent"
       android:layout_height="match_parent"/>
   
       <!--自定义loading动画，可以自定义为任何控件，也支持第三方动画库-->
       <ProgressBar
           android:layout_width="wrap_content"
           android:layout_height="wrap_content" />
   </com.gyf.loadview.LoadView>
   ```
> 在java中自定义loading样式
```java
   loadView.setLoadingView(new ProgressBar(this));
  ```
   或者
   
 ```java
      loadView.setLoadingView(R.layut.你的布局id);
```
- 使用三
```java
   LoadView loadView = new LoadView(this);
   addView(loadView);
   ```
### 高级用法
- 使用LoadManager自定义LoadView全局样式(LoadManager还有很多方法，请参考[LoadManager](https://github.com/gyf-dev/LoadView/blob/master/loadview/src/main/java/com/gyf/loadview/LoadManager.java)类，这里就不一一举例了)
```java
   LoadManager.getInstance().setEmpty("空的数据",R.mipmap.empty)  //自定义加载为空，展示的样式
                   .setFail("失败了",R.mipmap.fail);  //自定义加载失败，展示的样式
   ```
   
- LoadView状态和方法监听

  >设置当前状态
   ```java
          loadView.setCurrentStatus(LoadStatus.UNDO);  //默认值
          loadView.setCurrentStatus(LoadStatus.LOADING);  //加载中
          loadView.setCurrentStatus(LoadStatus.FAIL);  //加载失败
          loadView.setCurrentStatus(LoadStatus.ERROR_NET);  //网络错误
          loadView.setCurrentStatus(LoadStatus.EMPTY);   //数据为空
          loadView.setCurrentStatus(LoadStatus.SUCCESS);  //加载成功
    ```
  
  >设置加载失败监听
  ```java
     loadView.setOnFailClickListener(new LoadView.OnLoadFailClickListener() {
                 @Override
                 public void onLoadFailClick() {
                     // do something，比如获取数据等
                 }
             });
    ```
  >设置网络错误监听
    ```java
      loadView.setOnErrorNetClickListener(new LoadView.OnLoadErrorNetClickListener() {
                   @Override
                   public void onLoadErrorNetClick() {
                       // do something，比如设置网络或者获取数据等
                   }
               });
    ```
  >设置加载中监听
  ```java
     loadView.setOnLoadingListener(new LoadView.OnLoadingListener() {
                 @Override
                 public void onLoadingStart(View loadingView) {
                     //加载开始时,比如引用第三方动画库，开启动画等操作
                 }
     
                 @Override
                 public void onLoadingEnd(View loadingView) {
                     //加载结束时，比如引用第三方动画库，关闭动画等操作
                 }
             });
   ```

- LoadView属性和方法介绍
  
  | xml属性 | java方法 | 说明 |
  | :-------------: |:-------------:| :-------------:|
  | load_current_status | setCurrentStatus() | 设置当前loadView的状态 |
  | load_image_width | setImageViewSize() | 设置图片的大小 |
  | load_image_height | setImageViewSize() | 设置图片的大小 |
  | load_loading_width | setLoadingViewSize() | 设置Loading的大小 |
  | load_loading_height | setLoadingViewSize() | 设置Loading的大小 |
  | load_clickable | isLoadClickable() | 焦点是否在LoadView中 |
  | load_loading_clickable | isLoadingClickable() | 设置加载中，焦点是否在LoadView中 |
  | load_fail_clickable | isFailClickable() | 设置加载失败，焦点是否在LoadView中 |
  | load_error_net_clickable | isErrorNetClickable() | 设置加载网络错误，焦点是否在LoadView中 |
  | load_empty_clickable | isEmptyClickable() | 设置加载数据为空，焦点是否在LoadView中 |
  | load_gravity | setGravity()  | 设置布局的位置 |
  | load_loading_gravity | setLoadingGravity() | 设置Loading布局的位置 |
  | load_image_text_gravity | setImageTextGravity() | 设置图片和文字布局的位置 |
  | load_margin | setMargins() | 设置布局的左右上下边界值，单位px |
  | load_margin_left | 无 | 设置布局的左边界值，单位px |
  | load_margin_top | 无 | 设置布局的顶部边界值，单位px |
  | load_margin_right | 无 | 设置布局的右边界值，单位px |
  | load_margin_bottom | 无 | 设置布局的底部边界值，单位px |
  | load_loading_margin | setLoadingMargins() | 设置Loading布局的左右上下边界值，单位px |
  | load_loading_margin_left | 无 | 设置Loading的左边界值，单位px |
  | load_loading_margin_top | 无 | 设置Loading的顶部边界值，单位px |
  | load_loading_margin_right | 无 | 设置Loading的右边界值，单位px |
  | load_loading_margin_bottom | 无 | 设置Loading的底部边界值，单位px |
  | load_image_text_margin | setImageTextMargins() | 设置ImageText布局的左右上下边界值，单位px |
  | load_image_text_margin_left | 无 | 设置ImageText的左边界值，单位px |
  | load_image_text_margin_top | 无 | 设置ImageText的顶部边界值，单位px |
  | load_image_text_margin_right | 无 | 设置ImageText的右边界值，单位px |
  | load_image_text_margin_bottom | 无 | 设置ImageText的底部边界值，单位px |
  | load_image_margin | setImageMargins() | 设置Image布局的左右上下边界值，单位px |
  | load_image_margin_left | 无 | 设置Image的左边界值，单位px |
  | load_image_margin_top | 无 | 设置Image的顶部边界值，单位px |
  | load_image_margin_right | 无 | 设置Image的右边界值，单位px |
  | load_image_margin_bottom | 无 | 设置Image的底部边界值，单位px |
  | load_text_margin | setTextMargins() | 设置Text布局的左右上下边界值，单位px |
  | load_text_margin_left | 无 | 设置Text的左边界值，单位px |
  | load_text_margin_top | 无 | 设置Text的顶部边界值，单位px |
  | load_text_margin_right | 无 | 设置Text的右边界值，单位px |
  | load_text_margin_bottom | 无 | 设置Text的底部边界值，单位px |
  | load_text_fail | setFailText() | 设置加载失败文字 |
  | load_text_error_net | setErrorNetText() | 设置加载网络错误文字 |
  | load_text_empty | setEmptyText() | 设置加载为空文字 |
  | load_image_fail | setFailRes() | 设置失败的图片资源 |
  | load_image_error_net | setErrorNetRes() | 设置网络错误的图片资源 |
  | load_image_empty | setEmptyRes() | 设置无数据的图片资源 |
  | load_text_color | setTextColor() | 设置文字的颜色 |
  | load_text_color_fail | setFailTextColor() | 设置失败展示的字体颜色 |
  | load_text_color_error_net | setErrorNetTextColor() | 设置网络加载错误展示的字体颜色 |
  | load_text_color_empty | setEmptyTextColor() | 设置数据为空展示的字体颜色 |
  | load_text_size | setTextSize() | 设置字体大小,单位sp |
  | load_image_color | setImageColor() |设置图片的颜色 |
  | load_image_color_fail | setFailImageColor() | 设置失败图片的颜色 |
  | load_image_color_error_net | setErrorNetImageColor() | 设置网络错误图片的颜色 |
  | load_image_color_empty | setEmptyImageColor() | 设置数据为空图片的颜色 |
  | load_image_color_enabled | setImageColorEnabled() |设置是否可以修改图片的颜色 |
  | load_image_color_fail_enabled | setFailImageColorEnabled() | 设置是否可以修改失败图片的颜色 |
  | load_image_color_error_net_enabled | setErrorNetImageColorEnabled() | 设置是否可以修改网络错误图片的颜色 |
  | load_image_color_empty_enabled | setEmptyImageColorEnabled() | 设置是否可以修改数据为空图片的颜色 |
  | load_default_loading_color | setDefaultLoadingColor() | 设置默认的loading的颜色 |
  
      
## 混淆
 无

