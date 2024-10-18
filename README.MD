<h1 align="center">KYoutube</h1><br>

<div align="center">
<a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
<a href="https://android-arsenal.com/api?level=21" rel="nofollow">
    <img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat" style="max-width: 100%;">
</a>
  <img src="https://img.shields.io/badge/Platform-Android-brightgreen.svg?logo=android" alt="Badge Android" />
  <img src="https://img.shields.io/badge/Platform-iOS%20%2F%20macOS-lightgrey.svg?logo=apple" alt="Badge iOS" />
  <img src="https://img.shields.io/badge/Platform-JVM-8A2BE2.svg?logo=openjdk" alt="Badge JVM" />
    <img src="https://img.shields.io/badge/Platform-WASM%20%2F%20JS-yellow.svg?logo=javascript" alt="Badge JS" />
<a href="https://github.com/the-best-is-best/"><img alt="Profile" src="https://img.shields.io/badge/github-%23181717.svg?&style=for-the-badge&logo=github&logoColor=white" height="20"/></a>
</div>

### KYoutube is a Kotlin Multiplatform package that facilitates the integration of a customizable YouTube WebView component across various platforms, including Android, iOS, JVM, JavaScript, and WebAssembly. Built on the principles of Jetpack Compose and Compose for iOS, this package allows developers to embed and control YouTube video playback seamlessly in their applications

<hr>

[![Maven Central](https://img.shields.io/maven-central/v/io.github.the-best-is-best/kyoutube)](https://central.sonatype.com/artifact/io.github.the-best-is-best/kyoutube)

KMM Crypto is available on `mavenCentral()`.

```kotlin
implementation("io.github.the-best-is-best:kyoutube:1.0.0")
```

### How to use it

```kotlin
Box(
      modifier = Modifier.fillMaxWidth()
          .fillMaxHeight(.5f).clip(RoundedCornerShape(15.dp))
  ) {
      KYoutube("51tBJRncZnI")
  }
```
