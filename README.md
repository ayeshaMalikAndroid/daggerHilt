# daggerHilt
Hilt in android kotlin

Hilt is a dependency injection framework for Android apps developed by Google. It is built on top of Dagger and aims to simplify the process of providing and injecting dependencies into Android components, such as activities, fragments, services, and ViewModel.

With Hilt, you can reduce boilerplate code, make your codebase more maintainable, and improve testability. It's especially useful in large Android projects where managing dependencies manually can become cumbersome.

Advantages of Hilt

Simplified Setup:
With Dagger 2, developers need to create and configure multiple Dagger components and modules, which can be overwhelming, especially for beginners.
 Hilt, on the other hand, automates most of the setup using annotations and reduces the amount of boilerplate code required.
 
Predefined Annotations:
Hilt introduces new annotations that are specifically designed for Android components, such as @AndroidEntryPoint, which can be used on activities, fragments, services, and ViewModels. 
These predefined annotations make it easier to enable dependency injection for Android components without the need to define custom components or modules manually.

Integration with Android Components:
Dagger Hilt is tightly integrated with Android's lifecycle. This means that Hilt components are automatically created and destroyed based on the Android component's lifecycle, such as when an activity is created or destroyed.
 This seamless integration eliminates the need for developers to manually manage the lifecycle of Dagger components, reducing the chances of memory leaks and other related issues.
 
Simplified Scoping:
In Dagger 2, managing component scopes and custom scopes can be complex and require extra code. 
Hilt introduces predefined scopes like @Singleton, @ActivityScoped, @FragmentScoped, etc., which can be easily applied to classes to manage the lifecycle and reuse of dependencies.
