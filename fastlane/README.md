fastlane documentation
================
# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```
xcode-select --install
```

Install _fastlane_ using
```
[sudo] gem install fastlane -NV
```
or alternatively using `brew cask install fastlane`

# Available Actions
## Android
### android clean
```
fastlane android clean
```
Clean directory
### android tests
```
fastlane android tests
```
Runs all the tests
### android screenshots
```
fastlane android screenshots
```
Capture Screenshots
### android build_beta_debug
```
fastlane android build_beta_debug
```
Build Development Debug APK
### android build_beta_release
```
fastlane android build_beta_release
```
Build Development Release APK
### android deploy_beta
```
fastlane android deploy_beta
```
Deploy Beta Version to Play Store

----

This README.md is auto-generated and will be re-generated every time [fastlane](https://fastlane.tools) is run.
More information about fastlane can be found on [fastlane.tools](https://fastlane.tools).
The documentation of fastlane can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
