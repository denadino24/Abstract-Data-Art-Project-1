# Abstract-Data-Art-Project-1
# Unit 4 - Abstract Art Project

## Introduction

Data visualizations are powerful tools to present information and convey patterns and relationships. Sometimes visualizations are charts or graphs, and other times they are more abstract pieces of art. Your goal is to create a visual representation relating at least two categories from your dataset that engages your viewer and encourages them to learn more about your chosen topic.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data visualization program:

- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that will make up your visualization.
- **Implement one or more algorithms** – Implement one or more algorithms that use two-way or multi-selection statements with compound Boolean expressions to analyze the data.
- **Use methods in the Math class** – Use one or more methods in the Math class in your program, such as to perform calculations on the values in your dataset and display the results, choose random values from the dataset, or display images or shapes at random locations.
- **Create a visualization** – Create an image or animation that conveys the story of the data by illustrating the patterns or relationships in the data.
  Note: This may be abstract! Others do not necessarily need to know what the story or pattern is right away, but you do need to be able to explain it to them.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## Dataset

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type.
(https://docs.google.com/spreadsheets/d/1cpN2CBwEUBUkgaHXLLN7SkIGBSuO1zCe82EBxVqoBeQ/edit?gid=850151220#gid=850151220)

- **State** (String) - name of the state
- **Population** (int) - number of people in the country

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README.

![UML Diagram for my project](nameOfImageFileHere.png)

## Video Demo

Record a short video of your abstract art animation to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown

[![Thumbnail for my projet](nameOfThumbnail.png)](youtube-URL-here)

## Description

Write a description of your project here. In your description, include as many vocab words from our class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project.

In this Abstract Data Art Project, the program outputs images of state maps in different sizes on a white background based on the different state names and populations of those states. The dataset contains all different names of the 50 US States along with the population of each state. This project/ program will help address the question of which US states contain the most or least amounts of population. In the method, it determines if the certain states have a population above 38332521, below 38332521, or some other number. As the method is iterating, it checks to see if the population is greater than 38332521, if it is than the state map appears on the user's screen with a size of 80. If the population its less than 38332521, the state map image will apear at a size of 50 and if there are any other populations, it will appear at a size of 25. 
