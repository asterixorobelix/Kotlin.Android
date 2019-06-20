# Kotlin.Android

![Meme](https://cdn-images-1.medium.com/max/1600/0*fg_6c7tcoexdgSng.jpg)

## Android recommended architecture

![Android Architecture](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)

![Clean architecture](https://raw.githubusercontent.com/android10/Sample-Data/master/Android-CleanArchitecture-Kotlin/architecture/clean_architecture_reloaded_main.png)

![Architecture layers](https://raw.githubusercontent.com/android10/Sample-Data/master/Android-CleanArchitecture-Kotlin/architecture/clean_architecture_reloaded_layers.png)

![MVVM](https://raw.githubusercontent.com/android10/Sample-Data/master/Android-CleanArchitecture-Kotlin/architecture/clean_architecture_reloaded_mvvm_app.png)

![Repository](https://raw.githubusercontent.com/android10/Sample-Data/master/Android-CleanArchitecture-Kotlin/architecture/clean_archictecture_reloaded_repository.png)

### NB
* https://fernandocejas.com/2018/05/07/architecting-android-reloaded/
* https://developer.android.com/jetpack/docs/guide
* https://developer.android.com/topic/libraries/architecture/livedata
* https://github.com/googlesamples/android-architecture-components/blob/88747993139224a4bb6dbe985adf652d557de621/GithubBrowserSample/app/src/main/java/com/android/example/github/repository/NetworkBoundResource.kt
* https://github.com/bufferapp/android-clean-architecture-boilerplate

Independence of UI and datasource (database or api)

### Nice to have

* https://developer.android.com/jetpack/docs/guide
* https://developer.android.com/jetpack/arch/
* https://developer.android.com/topic/libraries/architecture/
* https://developer.android.com/jetpack/docs/getting-started - incomplete documentation
* [Sunflower app](https://github.com/googlesamples/android-sunflower) - alpha release, still in development
* https://github.com/googlesamples/android-architecture-components/blob/master/README.md
* https://developer.android.com/guide/components/fundamentals
* https://developer.android.com/training/basics/firstapp/
* https://codelabs.developers.google.com/?cat=Android
* https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/#0
* [The Google I/O 2018 Android App ](https://github.com/google/iosched)
* [Kotlin android samples](https://developer.android.com/samples/?language=kotlin)

## Reading matter
* https://www.one-tab.com/page/EyqDriw0SOWodYBh2uHwCg
* https://www.one-tab.com/page/0XCo2cWlStuNPJyq10S3zA
* https://www.one-tab.com/page/uXFBTn6mRDG_Et0niCZ6Zg
* https://www.one-tab.com/page/TDfNLqRPSLu9G6Z_M4Pp5w
* https://hadihariri.com/2014/01/06/intellij-idea-minimal-survival-guide/
* https://hadihariri.com/2013/12/29/jvm-minimal-survival-guide-for-the-dotnet-developer/
* https://kotlinlang.org/docs/reference/basic-syntax.html
* https://github.com/yelp/kotlin-android-workshop
* https://developer.android.com/kotlin/
* https://www.youtube.com/playlist?list=PLpg00ti3ApRweIhdOI4VCFFStx4uXC__u
* https://android.jlelse.eu/learn-kotlin-while-developing-an-android-app-introduction-567e21ff9664
* https://superkotlin.com/resources-learn-kotlin/
* http://libgen.io/book/index.php?md5=FBE6BA595EC371A42AF292DF4ACCEDB9
* https://exercism.io/
* https://www.one-tab.com/page/YsI_WVfySjmfgN40eprpQg

## Productivity
* [keyboard shortcuts](https://developer.android.com/studio/intro/keyboard-shortcuts)
* https://plugins.jetbrains.com/plugin/9792-key-promoter-x
* https://plugins.jetbrains.com/plugin/7275-codeglance
* [Rainbow brackets](https://plugins.jetbrains.com/plugin/10080-rainbow-brackets)
* https://angrynerds.pl/blog/top-12-plugins-for-android-studio/
* https://blog.aritraroy.in/30-kickass-tools-to-develop-android-apps-like-a-pro-191e52b9419b

## udacity
* https://classroom.udacity.com/courses/ud9012

## Apps

* [Dice roller](https://github.com/asterixorobelix/Kotlin.Android/tree/master/udacity/DevelopingAndroidAppswithKotlin/diceRoller)
* [About me](https://github.com/asterixorobelix/Kotlin.Android/tree/master/udacity/DevelopingAndroidAppswithKotlin/AboutMe)
* [Color my views](https://github.com/asterixorobelix/Kotlin.Android/tree/master/udacity/DevelopingAndroidAppswithKotlin/ColorMyViews)


## Gotchas

### var vs val
    var can be assigned to multiple times, whereas val can be initialized or assigned to only once.
### [Databinding](https://developer.android.com/topic/libraries/data-binding/two-way)
    The @={} notation, which importantly includes the "=" sign, receives data changes to the property and listen to user updates at the same time.
    
If you create a binding adapter for a LiveData property in your viewModel, you do not need to give the binding adapter the LiveData type, just the inner type. Eg:

Fragment
```
@BindingAdapter(value =["searchResults"])
fun setArchiveTextVisibility(textView: TextView, searchResults: PagedList<StorySummary>?){
    textView.visibility = if(searchResults.isNullOrEmpty()) View.VISIBLE else View.GONE
}
```

Viewmodel
```
val searchResults: LiveData<PagedList<StorySummary>>
```

fragment_search.xml
```
<TextView
    app:searchResults="@{viewModel.searchResults}"
    />
```
    
### Packages
Packages group related classes. Packages are declared with the package keyword, and any Kotlin file with a package declaration at the beginning can contain declarations of classes, functions, or interfaces. 
(Equivalent of C# namespaces)
    
## Command line compilation
![Command line without bothering about path variables](https://drive.google.com/uc?export=view&id=1447LFz3pLuU9s5dG1kTVjU97a6EJG6Sg)

