<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a name="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT LOGO -->
<br />
<div align="center">

<h3 align="center">Katalon (Mobile App Testing)</h3>

  <p align="center">
    by M. Faris
    <br />
    <a href="https://github.com/mfarisgh/ColorNote_Automation_Test_Faris/issues"><strong>Report Issues »</strong></a>
    <br />
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
        <li><a href="#test-scenarios">Test Scenarios</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#running-the-automation-tests">Running the Automation Tests</a></li>
      </ul>
    </li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This is a POC Groovy/Java project for Automation Testing using Katalon to test ColorNote mobile app. 
The goal of this project is to demonstrate how an Automation Testing is done using tools/frameworks. 
Of course this project is not limited to its current conditions. 
You may fork it and customize it further depending on your needs.

* [Get to know about Automation Testing](https://www.techtarget.com/searchsoftwarequality/definition/automated-software-testing)
* [Get to know Katalon](https://katalon.com/)
* [Get to know ColorNote](https://www.colornote.com/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


### Built With

* Katalon Studio v8 (you may test with v9 at your own risk)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


### Test Scenarios

* Create text note
* Create checklist
* Single word search
* Multiple word search
* Text note reminder
* Checklist reminder
* Note archive
* Edit text note
* Edit checklist
* Revert note
* Delete text note
* Delete checklist
* Set achieve (done) on text note
* Set achieve (done) on checklist

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

The following are the instructions on setting up your project locally.
To get a local copy up and running, follow these simple steps.

### Prerequisites

The following prerequisites that you will need to get started:

1. This repo of course! You may download it as a zip file or "git clone" it to your computer.
2. Installed [Katalon Studio.](https://katalon.com/download)
3. [Node.js](https://nodejs.org/en/download/current)
4. Appium (after installation of Node.js), by running this command in Command Prompt/Terminal.
   ```sh
   npm install -g appium@1.22.3
   ```
5. Android device or emulator ([get Android Studio](https://developer.android.com/studio) and [install emulator](https://developer.android.com/studio/run/emulator)).
6. Enabled "USB debugging" in Android device/emulator. [Refer here on how to do it.](https://developer.android.com/studio/debug/dev-options)
7. Enabled "Install via USB" and "USB debugging (security settings)" if you use Xiaomi devices.
8. Enabled "Disable permission monitoring" if you use Oppo, Realme and OnePlus devices.
9. Installed [ColorNote app.](https://www.apkmirror.com/apk/notes/colornote-notepad-notes/) Refer [here](https://www.vrtourviewer.com/docs/adb/) on how to install it in your emulator (if you use emulator).

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Running the Automation Tests

1. Ensure that you have extracted or git-cloned the project folder into your local computer.
2. Open the project folder in Katalon Studio.
3. Choose and open by double-clicking any of the Test Cases or Test Suites in `Test Cases` or `Test Suites` folder.
4. Change profile/environment to `ColorNote` to be able to use all the variables/parameters specified in Test Cases. It is located on the top right, named "default".
5. Click on the arrow pointing down beside the Play button on the top right. Choose "Android".
6. Ensure your Android device/emulator is connected (via USB for real devices)/running. You should be able to select the available device to run the tests.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

M. Faris - [Facebook](https://fb.me/its.me.eff) - mfaris.official@gmail.com

GitHub : [mfarisgh](https://github.com/mfarisgh)

GitLab : [mfarisgl](https://gitlab.com/mfarisgl)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgements

* Katalon Docs * [Link 1](https://docs.katalon.com/katalon-studio/manage-projects/set-up-projects/mobile-testing/android/mobile-set-up-real-android-devices-in-katalon-studio)
* Katalon Docs * [Link 2](https://docs.katalon.com/katalon-studio/get-started/sample-projects/mobile/mobile-create-and-run-android-test-case)
* [Sandeep Duve (Appium Discuss)](https://discuss.appium.io/t/i-am-getting-following-error-while-executing-appium-java-script/29904)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
