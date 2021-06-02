from datetime import date

name = input("Enter you name: ")
age = input("Enter your age: ")
diff = 100 - int(age)
year = date.today().year + diff
print("You will be 100 years old in {}".format(year))
