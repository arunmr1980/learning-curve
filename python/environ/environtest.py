import os
#from decouple import config

# Setting an environment variable in code
os.environ['test-user'] = 'alex'


#Reading the env variable
user = os.getenv('test-user')
print(user)

# Reading a variable previously set in system
user = os.getenv('HOME')
print(user)
