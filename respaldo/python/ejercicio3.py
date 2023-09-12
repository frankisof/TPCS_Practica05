x=0
if x > 0:
 print(1)
elif x < 0:
        print(-1)
else :
        print(0);
print('\n')
total_candies=5
if total_candies==1:
        print("Splitting 1 candie" )
else :
        print("Splitting", total_candies, "candies")
        print (total_candies % 3)
print('\n')
have_umbrella = False
rain_level = 0.0
have_hood = False
is_workday = False
(not (rain_level > 0)) and is_workday
not (rain_level > 0 and is_workday)
actual = (have_umbrella, rain_level, have_hood, is_workday)
print(actual)
print('\n')
number=1
if number < 0:
        x= True
else:
        x= False

print("el numero...", number, "es negativo?")
print (x)
print('\n')
def wants_all_toppings(ketchup, mustard, onion):
    return ketchup and mustard and onion
print('\n')
def wants_plain_hotdog(ketchup, mustard, onion):
    return not (ketchup or mustard or onion)
print(wants_all_toppings(False, True, True))
print('\n')
def exactly_one_sauce(ketchup, mustard, onion):
    return (ketchup and not mustard) or (mustard and not ketchup)
print(exactly_one_sauce(False, True, True))
print('\n')
def exactly_one_topping(ketchup, mustard, onion):
    return (int(ketchup) + int(mustard) + int(onion)) == 1
print(exactly_one_sauce(False, True, True))