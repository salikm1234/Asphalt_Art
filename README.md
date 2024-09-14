# Unit 1 - Asphalt Art

## Introduction

Cities use asphalt art to improve public safety, inspire their residents and visitors, and brighten communities. Your goal is to create asphalt art to revitalize The Neighborhood and bring the community together with the help of the Painter.

## Requirements

Use your knowledge of object-oriented programming, algorithms, the problem solving process, and decomposition strategies to create asphalt art:
- **Create a new subclass** – Create at least one new subclass of the PainterPlus class that is used for a component of the asphalt art design.
- **Plan an algorithm** – Use the problem solving process and decomposition strategies to plan an algorithm that incorporates a combination of sequencing, selection, and/or iteration.
- **Write a method** – Write at least one method in a PainterPlus subclass that contributes to a component of the asphalt art design.
- **Document your code** – Use comments to explain the purpose of the methods and code segments.

## Notes: Neighborhood & Painter Class

This project was created on Code.org's JavaLab platform using the built in Neightborhood GUI output. To test and edit this project you must build in Code.org's JavaLab with the Neighborhood GUI enabled. For reference to the Painter class documentation, [you can read more here.](https://studio.code.org/docs/ide/javalab/classes/Painter)

## Output:

<img width="417" alt="image" src="https://github.com/user-attachments/assets/8421b415-54e6-4d29-9015-cfafdd7e0405">
<img width="411" alt="image" src="https://github.com/user-attachments/assets/446de8aa-6768-457e-9ce9-c653039cf75b">



## Reflection

1. Describe your project.

My project's aim is to sketch the ghost character from the popular video game Pac Man. The code aims to be as customizable as possible for the user. 
The ghost is constructed on an 8x8 grid. I created two classes myself, the BackgroundPainter and Character Painter, while the Painter Plus class was 
used from code.org. The NeighborhoodRunner class was used to create objects of the character and background classes and to run the methods in the main.  

2. What are two things about your project that you are proud of?

One thing about my project that I am proud of is the customizability. It is very easy for the user to set the color of the ghost and the color of the background.
The user simply needs to go into the NeighborhoodRunner class, and change two arguments to their preferred colors, and voila! The second thing I am proud of 
is the creation of the reset method. Keeping track of the painter's position across multiple methods became tedious and confusing, so I created a reset method
that will take the painter back to the top left corner, facing east regardless of where he happens to be on the grid. This method is called after every component is painted. 

3. Describe something you would improve or do differently if you had an opportunity to change something about your project.

Given the opportunity to redo this project, I would use a bigger grid than the 8x8 so that the resolution of the image would come out better. I would also modify the code
to take the size of the grid as an input so that all the movements could be scaled accordingly. 
