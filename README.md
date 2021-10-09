# ShapeSort
## Introduction
The goal of shapesort is to be able to sort an arbitrary randomly generated list of shapes with diffrent attributes by size. By all means this is a simple task however the task of implementing this Using OOD with each shape as its own class proved more difficult then expected.
The Principles that I will be using to carry out this design are test driven development as well as iterative development. 

Since the goal of this project is simple I chose Iterative method of development since the project is generally of low compleity and also test driven development.
Classes Are Stuctured In Order of increasing Complexity Regarding the Shape Method 

----
##  Iteration 1  First Working Version
The initial iterative design  branch ``` working-trash ``` consisted of a main My_Panel Method which would include its own quicksort method. Instead of an Generic Shape class instead on this iteration. I instead started writing in Java the same way I would in Python. 

Under this first iteration here are some of the things I reasoned.

- Every Square is a Rectangle so therefore the Square class is not needed or should be a subclass of rectangle. 
- My_Panel currently contains the sorting method It should not contain quicksort function however.
- Circles and Rectangles need both direct and Object Oriented way of comparing to eachother one way of doing this is implementing direct comparison as in this iteration however this aproach is not scaleable.
- There is a need for a Shape Class which would contain generic attributes common in every shape. Each Shape needs its own Constructor.
- Compareto Needs an OOD method of generic comparison as a replacement for My_Panel method compare(Object a , Object b ).
-  ```MyPanel.java , My_Circle.java , My_Rectangle.java ```
![Iteration One ](https://or9.ca/images/lab3_diagram_invert.png)
Included is an rough UML diagram for the initial iteration of ShapeSort.

## Iteration 2 Modular OOP Oriented Iteration of ShapeSort

The second branch of my project included in this description is ``` working-modular ```. Within this iteration I was able to acomplish the following 
- Interface ShapeProperties is the guiding interface for shape and includes all methods that Shape must complete the requirements needed gained from ```working-trash```
- Shape.java created using ShapeProperties it is the parent class and will handle all further comparisons or added shapes which have not already been implemented.
- Shape.java optionally takes care of getArea() instead of refering to subclass.getArea()  
- My_Rectangle and My_Circle have been modified to be a subclass of shape and now most getters and setters interact with parent Shape.java
- Square.java has been Created as a subclass of Rectangle.java it now is able to be constructed with only an lengh.
- ShapeSort.java has been created to contain all of the required sorting methods. 
- Changes to My_Panel.java to implement modular design changes.




![Iteration Two ](https://or9.ca/images/lab3_diagram_invert.png)






The Idea Behind Tensor Jukebox is is to be able to better predict what music a person will like based on their age gender accent race and emotion.

Accent Detection in Machine Learning models is a newer concept so this project will consist of learning Tensorflow and then eventually working to reverse engineer the submissions for INTERSPEECH AESRC 2020 Challenge.

> NEMO ASR Tutorial and Introduction : https://colab.research.google.com/github/NVIDIA/NeMo/blob/r1.0.0b3/tutorials/asr/01_ASR_with_NeMo.ipynb

> Speech Recognition Training Using an Breakthrough Wav2Vec Model: https://www.kdnuggets.com/2021/03/speech-text-wav2vec.html

> Speaker Identification with NeMo : https://github.com/NVIDIA/NeMo/blob/main/tutorials/speaker_recognition/Speaker_Recognition_Verification.ipynb

> Speech Parsing and Recognition with Nvida Jasper : https://ngc.nvidia.com/catalog/models/nvidia:tlt-jarvis:speechtotext_english_jasper

> Nvidia auto Punctuation Methods : https://docs.nvidia.com/deeplearning/nemo/user-guide/docs/en/stable/nlp/punctuation_and_capitalization.html

```A Python3 Project ```

Shortlink: or9.ca/jbox

# Libraries In Use
 *BACKGROUND BASED ON ACCENT - Not Final*
> https://gitee.com/ephemeroptera/arnet.git
 
 *ETHNICITY GENDER AND AGE*
 
> https://github.com/serengil/deepface

# Future Libraries and Needed Features to look out for

> Spotify Bluetooth Implementation

> Apple Music Bluetooth Implementation

> Better Emotion Tracking Libraries

> Statistics on Peak Music Stagnation

> List of Intergenerational Songs

> Music Prefrences Based on Age Gender and Major Catagories of that Group.

> Boring Database Stuff


## Intructions to install Complete:

If you are having trouble following the install steps try following the workflow located in ```.github/workflows/python-app.yml```
Execute the commands found under ```Install dependencies``` and execute these commands in an admin command line.

change ```cu110``` to the version of ```cuda``` you are using or instead use ```cpu``` in its place if you do not have an Nvidia GPU. 


Install MinGW and make sure that gcc is working on system path.

- Do this like me first install choco in powershell https://chocolatey.org/install and run the ps1 script.
- make sure choco is on system path
- Then do  ```choco install mingw``` 

Follow this tutorial to get a general understanding of Git bash https://kbroman.org/github_tutorial/pages/first_time.html

## The Command Needed to download the repo is

```git clone --recurse-submodules git@github.com:orionnelson/tensor-jukebox```
or
```git lfs clone``` *You want to work on wav2vec model.
```git lfs clone --recurse-submodules git@github.com:orionnelson/tensor-jukebox```

## Before Installing Requirements First Install both Cmake and Visual Studio Cmake addons.

Follow this tutorial here https://medium.com/analytics-vidhya/how-to-install-dlib-library-for-python-in-windows-10-57348ba1117f

Next I would recommend setting up ```pyvenv``` https://docs.python.org/3/library/venv.html use ```python -m ``` not ```python3```
```
1 : Get cmake  >> pip install cmake
2 : Install dlib  >> pip install dlib -vvv
WAIT YOU HAVE CUDA WORKING RIGHT?
3 : pip install torch==1.7.1+cu110 torchvision==0.8.2+cu110 torchaudio==0.7.2 -f https://download.pytorch.org/whl/torch_stable.html # cu110 is the cuda version max is 111 for torch without extra work.
 Then >> pip install -r requirements.txt
4 : If you get an error that is not 'face was not detected' try reinstalling keras 2.6.0rc0 and it will fix the issue.
```
Install takes >30 min due to slow repo's will fix later.

## Make sure a webcam is connected in order to test ```DeepFaceExample.py```


