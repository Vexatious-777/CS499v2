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

#i .Informal Code Review:

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

