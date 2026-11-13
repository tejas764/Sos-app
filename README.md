<p align="center">
  <a href="README.md"><strong>OVERVIEW</strong></a> &nbsp; · &nbsp;
  <a href="DEMO.md"><strong>DEMO & SCREENSHOTS</strong></a> &nbsp; · &nbsp;
  <a href="DEMO.md#demo-setup"><strong>SETUP & DEPLOYMENT</strong></a>
</p>

# SOS — Android Emergency Assistance Prototype

An academic Android application exploring emergency-assistance screens, map integration, and an emergency-vending interface.

**Kotlin · Android Views · View Binding · Google Maps SDK**

## Current scope

| Area | Repository implementation |
| --- | --- |
| Navigation | Splash, main application, and bottom-navigation screens |
| Account UI | Login and signup activities |
| SOS map | Google Maps screen with a fixed sample marker |
| Vending UI | Vending activities, product resources, and related fragments |
| Firebase setup | Google Services plugin and configuration file; service dependencies need review |

The current `SOSActivity` adds a fixed marker. Live ambulance tracking, nearby-user alert delivery, and hardware vending integration are not established by this implementation. Treat this as a prototype, not an operational emergency service.

## Getting started

```bash
git clone https://github.com/tejas764/Sos-app.git
```

1. Open the repository root in Android Studio.
2. Install Android SDK 35 and use the IDE's Gradle-compatible JDK.
3. Sync Gradle. The app targets SDK 35 and supports Android API 24 or newer.
4. Configure your own Google Maps project/key. The current manifest contains an inline Maps key; replace it with appropriate configuration and key restrictions for your application.
5. Replace `app/google-services.json` with the configuration for your own Firebase project if retaining the Google Services plugin.
6. Select an emulator or Android device and run the `app` configuration.

The source's Java/Kotlin target is 11; this is not necessarily the JDK version required to run the Android Gradle plugin.

## Project structure

| Path | Purpose |
| --- | --- |
| [app/src/main/java/](app/src/main/java/) | Kotlin activities, fragments, and models |
| [app/src/main/res/](app/src/main/res/) | Layouts, images, themes, and navigation resources |
| [app/src/main/AndroidManifest.xml](app/src/main/AndroidManifest.xml) | Activities and Maps configuration |
| [app/build.gradle.kts](app/build.gradle.kts) | SDK settings and app dependencies |
| [gradle/libs.versions.toml](gradle/libs.versions.toml) | Dependency version catalog |

## Build and checks

After Android Studio setup, run `gradlew.bat assembleDebug` on Windows or `bash gradlew assembleDebug` on macOS/Linux. Review the supplied example tests before relying on them as feature coverage.

For manual verification, check navigation, map loading, account-screen behavior, and vending screens. Real alerting and tracking need backend implementation, permissions, and end-to-end testing.

## Author

[Tejas Bhandarkar](https://github.com/tejas764) · CHRIST University, Bengaluru
