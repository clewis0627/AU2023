# 
# Random Strong Password Generator
# Author: Cameron Lewis
# Created: 26 APRIL 2023
# 

import random

# Funciton used to shuffle strings
def shuffle(string):
    tempPWD = list(string)
    random.shuffle(tempPWD)
    return ''.join(tempPWD)

# Randomly chooses five uppercase letters using ASCII
upperLetter1 = chr(random.randint(65,90))
upperLetter2 = chr(random.randint(65,90))
upperLetter3 = chr(random.randint(65,90))
upperLetter4 = chr(random.randint(65,90))
upperLetter5 = chr(random.randint(65,90))

# Randomly chooses five lowercase letters using ASCII
lowerLetter1 = chr(random.randint(97,122))
lowerLetter2 = chr(random.randint(97,122))
lowerLetter3 = chr(random.randint(97,122))
lowerLetter4 = chr(random.randint(97,122))
lowerLetter5 = chr(random.randint(97,122))

# Randomly chooses seven numbers
num1 = random.randint(0,9)
num2 = random.randint(0,9)
num3 = random.randint(0,9)
num4 = random.randint(0,9)
num5 = random.randint(0,9)
num6 = random.randint(0,9)
num7 = random.randint(0,9)

# List of available Special Characters for use in passwords according to IBM
# Did not include characters that were unavailable to use as the first character
specialCharacterOptions = [33, 40, 41, 63, 91, 93, 64, 35, 36, 37, 38, 94, 42]

# Randomly chooses three special characters
spcChar1 = chr(specialCharacterOptions[random.randint(0,12)])
spcChar2 = chr(specialCharacterOptions[random.randint(0,12)])
spcChar3 = chr(specialCharacterOptions[random.randint(0,12)])

# Combines all characters into a string to be later randomized
# Password will be 20 characters long
password = (upperLetter1 + upperLetter2 + upperLetter3 + upperLetter4 + upperLetter5 + lowerLetter1 + lowerLetter2 + lowerLetter3 + lowerLetter4 + lowerLetter5 +
            str(num1) + str(num2) + str(num3) + str(num4) + str(num5) + str(num6) + str(num7) + spcChar1 + spcChar2 + spcChar3)

# Randomizes password string
password = shuffle(password)

# Makes sure that password does not start with special character to comply with certain organizations with that requirement
while (password.startswith(spcChar1) == True or password.startswith(spcChar2) == True or password.startswith(spcChar3) == True):
    shuffle(password)

# Prints the randomized strong password.
print("\nNew Password: " + password + "\n")
