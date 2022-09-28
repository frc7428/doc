# Doc

Doc is a shared library for FRC 7428.

## Preparing Your Project

First, you must make sure your robot project has the following dependencies:
- Phoenix (CTRE)
- REVLib
- WPILibNewCommands

With those vendor dependencies added to your project, you can add `doc` to it.


## Adding `doc` to the Project

You will need to make two changes to the `build.gradle` file in your robot project.

First, add this top-level block (you may do so at the end of the file).
```
repositories {
    mavenCentral()
    maven { 
        url 'https://jitpack.io' 
    }
}
```

Next, find the `dependencies` block and add one line at the top of it.
```
dependencies {
    implementation 'com.github.frc7428:doc:<versionTag>'
}
```

In this case, `versionTag` is a specific release tag from the GitHub project. For example, `v2022.1.0` is a release tag that would work, making the whole line `implementation 'com.github.frc7428:doc:v2022.1.0'`.

If you follow the above steps, you should be able to build and deploy your robot project. You'll want to make sure that your dependency versions and WPILib versions match across your project and the `doc` library.