[![Official project](https://jb.gg/badges/official-plastic.svg)](https://github.com/JetBrains#jetbrains-on-github)
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# Get started with [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform)

This repository contains four separate projects. Each project accompanies corresponding sections of the [Get started with Compose Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-getting-started.html) tutorial.
You can open and run each project or follow the tutorial manually and create your own.

### ComposeDemoStage1

This project reflects steps 2, 3, and 4 of the tutorial.

In this project, we:

1. Create a project using the [Kotlin Multiplatform wizard](https://kmp.jetbrains.com/).
2. Add a dependency on the [kotlinx-datetime](https://github.com/Kotlin/kotlinx-datetime) library.
3. Add the `todaysDate()` function that returns current date.
4. Invoke this function from the `App` composable.

That's how your application should look at the end of the [Modify the project](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-modify-project.html) step.

### ComposeDemoStage2

This project reflects the changes made at the beginning of the fifth step of the tutorial.

In this project, we:

1. Rewrite the `App` composable from scratch, removing unnecessary imports and code.
2. Alter the `main()` function to improve the window rendering on desktop.
3. Add support for user input and style the composable.
4. Create and invoke the `currentTimeAt()` function that returns current time at a particular location.
5. Improve the appearance of composables.

That's how your application should look at the end of the [Improve the style](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-new-project.html#improve-the-style) section on the fifth step of the tutorial.

### ComposeDemoStage3

This project reflects the changes made in the [Refactor the design](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-new-project.html#refactor-the-design) section on the fifth step of the tutorial.

In this project, we change the application design. Users can now select items from a dropdown menu instead of manually using the text field.

### ComposeDemoStage4

This project reflects the changes made in the [Introduce images](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-new-project.html#introduce-images) section on the fifth step of the tutorial.

In this project, we:

1. Include images in the `composeResources` folder of the application.
2. Enhance the dropdown menu to display each item with an image.

This is the final stage of the tutorial. That's how your application should look at the end of the [Create your own application](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-new-project.html) step.
