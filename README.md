# Professional Self-Assessment

 I think that completing my coursework throughout the program and developing my ePortfolio has helped me showcase my strengths as well as shape my professional goals and values
 , and prepare me to enter the computer science field. By showing my ability to research new methods and tools and to not be afraid to use them. It has also shown me how valuable
 within the professional sphere mentors and outside help will be since I feel as if I had team members working beside me it may have helped me to be able to ask for their input
 on some of my challenges during development. Which I believe to be a strength and not a weakness when someone is able to realize that a helping hand is exactly what is needed
 to get the job done.
 
 This leads me to the following topics of 
 Collaborating in a team environment: When it comes to the idea of collaborating within a team environment, I am actually excited to eventually work alongside other developers
 on a project. This mainly due to the fact that almost the entirety of my courseload as been me working on my course workload alone and would love the ability to chat with some-
 one else about Software development in-person! I am also a man with little ego and would love to actually have my work critqued, that way I can learn faster from someone with
 more experience.
 
 Communicating with stakeholders: Communicating with stakeholders is a concept that has been covered during my courseload but it still feels like an alien experience but one
 I am excited to experience at some point. Though I won't lie and say that I am going to love rejecting their ideas once the scope of the project could potentially be blown
 out of proportion due to potential add ons they feel are neccessary.
 
 Data structures and algorithms: Data Structures and algorithms seem to be the ever present companion of computer scientists and do make up the majority of computer applications
 since Data structures are how the data is saved and used in the future such as: Lists,Arrays, and HashMaps. While Algorithms are the instructions that are fed to the computer
 to ensure that it does exactly what you want it to do. However, it takes breaking down those instructions into a language it can understand to make those instructions usable.
 Software engineering and database: Software engineering is the concept of creating a system based of multiple lines of code to create an entire instruction set for a computer.
 This instruction set could be alot of different things such as: office tools(e.g. Word Processors, Spreadsheets, etc.), A/V editing tools, video games, etc.
 Databases are the digital manifestion of records stored under different forms of organization usually a schema that details what it can be expected to be filled with.
 For example, if a database is meant to hold information in connection to music it might have a series of fields like so: "Artist", "Genre", "Album", "Song Name". Also most
 databases are meant to be searchable and use those fields to filter and provide the relevant data back to the user. Of which I most familar with MongoDB.
 
 Security: Security is becoming extremly important within the modern field of software engineering. It is a skill that I need to grow in the most I feel. However, I am aware
 that with the proper care when developing some software and thinking ahead. A developer can premptivley tackle this by developing with common exploits in mind like making sure to
 store senstive data in an encrypted format. Not using tools with known exploits or instead updating them to the most current version if those exploits have been removed.
 As well as staying up-to-date with security trends.

 My artifact should show you that I still have a lot to learn but that with the right work environment, I will be an employee that will grow and become strong addition to the team
 and a solid investment. It shows that I will research and take advantage of modern tools and features. While also not being afraid to try new things during development. It
 also shows that I can at times bite off more than I can chew but ambition is better than stagnancy.
 The artifact itself is a java based appointment service web application, that takes advantage of MongoDB for database needs and uses Quarkus as a framework tool.
 It was initially just a series of jUnit test cases, that I wanted to blow up into a full-fledged full-stack application but I was not able to fully get there at the time
 of my current due date. I do plan to continue it's development. Having said that though the Database integration works flawlessly and so does the back-end logic for querying
 the database for users and appointments. However, the security features do not fully work it is able to realize a proper log-in from a user within the database and accept new
 users through the registration page but the pages do not link to one another correctly and my JWTs might not be working as intended due to them not being passed as an authorization header
 if my error logs are to be believed.



# CS499v2
The first attempt at CS499 was a try at using gradle as a build tool. It led to a few conflicts that I could not resolve,
So, I swapped to Maven due to my familiarity with it in previous course material. (That's why I have two cs499 repo's)

This application was primarily created for my Computer Science Capstone final project at SNHU.
#
The primary goal of my computer science capstone was to take one or multiple different "Artifacts" from either other classes 
I have taken and demonstrate my growth by enhancing them.

I decided to take one of my earlier classes course work of building Junit tests for a fictional task scheduler application and
instead tackle the task of building a full-stack variant of a task scheduler.

I decided to try and use Quarkus a Java framework that is meant to assist developers in creating software meant to run on virtual or cloud-based machines.
Not entirely neccessary in this case but I though it would be interesting to play with modern tools, while creating something that could potentially be used within the context
of a cloud-based environment.

# i .Informal Code Review:
(Youtube link to be added later)

# ii. Narratives and Core Artifact:
 
 This was the branch meant to incorporate security features.
 That unfortunately did not go as I had initialy planned.
 I ran into more setbacks than I would care to admit, which only proves how much more I have to learn within the field.
 Having said that I do plan to continue to refine this artifact until I find it flawless.
 As it stands right now I have html pages set-up for multiple front-end endpoints that the user is meant to interact with
 that should enable them to Register, login, make appointments, make appointments using csv files, and search appointments already within the database.

 However, right now the webpages don't currently properly link to one another as intended after multiple attempts and reconfigurations to get around my current primary issue
 with the security measures to the point that I tried to comment them out just to try and traverse between them. Now, they only work as intended in isolation when visited directly
 using Developer tools or direct URL addresses.

 The MongoDB database does work as intended though and can be queried succesfully! It is also used to store user data, which will properly check for them. It was just trying to
 incorporate JWT based security measures which led to most of my issues. I ran into an Authorization header issue where it was not being saved correctly between page traversals.
 Afterwards, I went through different possibilites but it came up fruitless. To be honest I should have saved each attempt as a different branch so I could have them all here for
 future troubleshooting. Which is a lesson I mean to take with me going forward! I also need to cover in-depth JavaScript and HTML to see if there is anything simple that escaped my
 notice as well as read through more of the Quarkus documentation as well as REST materials to improve as I move forward.

 In the end I feel that I demonstrated my ability to build a collaborative environment that enables diverse audiences to support organizational decision making in the field of
 computer science as well as Design, Develop, and Deliver professional-quality oral,written, and visual communications that are
 coherent, technically sound, and appropriately adapted to specific audiences and contexts
 by performing a code review that took my orginal artifact and drafted a plan to improve upon simple test cases and work to expand upon that idea 
 to make an appointment tracking full-stack application.

 I designed and evaluated computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to its solution,
 while managing the trade-offs involved in design choices by realizing that my first choice of PostgreSQL wasn not going to work as intended, So I swapped to MongoDB.
 I also realized I could use MongoDB to properly sort my database using algorithms already put into place to simplfy my application, Which did end up helping immensely. 
 I realized late unfortunately that I either needed to find another way to secure my web application or more time poring over documentation to figure out,
 What exactly I should have done instead when it came to my use of JWTs and authorization headers.

 I demonstrated an ability to use well-founded and innovative techniques,skills, and tools in computing practices for the purpose of implementing computer solutions that deliver
 value and accomplish industry-specific goals by incorporating Quarkus a java framework tool to aid me during the devleopment process and also allows
 integration with other frameworks and APIs like PanacheMongo,REST, and Jakarta.

 I tried to Develop a security mindset that anticipates adversarial exploits in software architecture and designs to expose potential vulnerabilites, mitigate design flaws,
 and ensure privacy and enhanced security of data and resources by securing access to the applicaiton using security features provided within my Quarkus application.
 However, this is where I ran into alot of issues during development and did not succeed in properly developing a functioning application that properly utilizes
 modern security measures.

 

# The primary aims of this application are as follows:
 1. Enable a user to create an appointment. (Completed)
 2. Enable a user to sort the appointments (Completed)
 3. Enable the software to store these appointments using a database. (Completed)
 4. Provide security features to ensure only authorized users are able to create appointments (In progress)
 5. Provide security features to ensure only authorized admin users are able to search appointments. (In progress)

Bonus Aims:

Enable users to submit CSV files for mass appointment additions to the database. (Completed)

Enable admin users to sort appointments based on multiple factors (In Progress)

Alert when appointments conflict with one another and ask for administrator clarification. (In Progess)

Prettier webpages???? (In Progress)

