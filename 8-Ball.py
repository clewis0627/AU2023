# 
# Magic 8-Ball Program
# Author: Cameron Lewis
# Created: 25 APRIL 2023
# Last Updated: 26 APRIL 2023
# 

import random

# Each function contains a possible response and will be called upon depending on what the Magic 8-Ball decides.
print("\n")
print("\n")
print("\n")
print("      _____  ______       _ _    ")
print("     |  _  | | ___ \     | | |   ")
print("      \ V /  | |_/ / __ _| | |   ")
print("      / _ \  | ___ \/ _` | | |   ")
print("     | |_| | | |_/ / (_| | | |   ")
print("     \_____/ \____/ \__,_|_|_|   ")
print("\n")

play = True

while(play==True):
    
    # Possible outcomes that the Magic 8-Ball can respond with.
    def r1():
        print("It is certain.")

    def r2():
        print("It is decidely so.")

    def r3():
        print("Without a doubt.")

    def r4():
        print("Yes definitely.")

    def r5():
        print("You may rely on it.")

    def r6():
        print("As I see it, yes.")

    def r7():
        print("Most likely.")

    def r8():
        print("Outlook good.")

    def r9():
        print("Yes.")

    def r10():
        print("Signs point to yes.")

    def r11():
        print("Reply hazy, try again.")

    def r12():
        print("Ask again later.")

    def r13():
        print("Better not tell you now.")

    def r14():
        print("Cannot predict now.")

    def r15():
        print("Concentrate and ask again.")

    def r16():
        print("Don't count on it.")

    def r17():
        print("My reply is no.")

    def r18():
        print("My sources say no.")

    def r19():
        print("Outlook not so good.")

    def r20():
        print("Very doubtful.")

    # Lets user ask the Magic 8-Ball their question.
    question = input("What is your question for the Magic 8-Ball?   ")
    
    # Magic 8-Ball randomly chooses what the answer to their question is.
    choice = random.randrange(1,20,1)
    
    # Logic to print the statement corresponding with the Magic 8-Ball's answer.
    if(choice==1):
        r1()
    if(choice==2):
        r2()
    if(choice==3):
        r3()
    if(choice==4):
        r4()
    if(choice==5):
        r5()
    if(choice==6):
        r6()
    if(choice==7):
        r7()
    if(choice==8):
        r8()
    if(choice==9):
        r9()
    if(choice==10):
        r10()
    if(choice==11):
        r11()
    if(choice==12):
        r12()
    if(choice==13):
        r13()
    if(choice==14):
        r14()
    if(choice==15):
        r15()
    if(choice==16):
        r16()
    if(choice==17):
        r17()
    if(choice==18):
        r18()
    if(choice==19):
        r19()
    if(choice==20):
        r20()
   
    # Asks user if they want to play again.
    userInput = input("Do you want to ask another question? [Y/N]   ")
    if(userInput!= 'Y'):
        play = False

print("The Magic 8-Ball never lies. Farewell until next time.")


