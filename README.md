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

# The primary aims of this application are as follows:
# 1. Enable a user to create an appointment.
# 2. Enable an administrator user to sort the appointments
# 3. Enable the software to store these appointments using a database.
# 4. Provide security features to ensure only authorized users are able to create appointments 
(RBAC security is the current plan... still under development at this time 2/11/2025)
# 5. Provide security features to ensure only authorized admin users are able to search appointments.

# Bonus Aims:
# Enable users to submit CSV files for mass appointment additions to the database.
# Enable admin users to sort appointments based on multiple factors 
# Alert when appointments conflict with one another and ask for administrator clarification.
# Prettier webpages????
