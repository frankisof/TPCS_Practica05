def has_lucky_number(num):
        if num % 7 == 0:
            return True
        else :
             return False
print(has_lucky_number(9))
print('\n')
plista=[1,2,3,4]
def elementwise_greater_than(L, thresh):
    return [ele >thresh for ele in L]
print(elementwise_greater_than(plista,2))
print('\n')
lista_comida=["pollo","papas","pollo"]
def menu_is_boring(meals):
 for i in range(len(meals)-1):
        if meals[i] == meals[i+1]:
            return True
        return False
print(menu_is_boring(lista_comida))
print('\n')

def estimate_average_slot_payout(n_runs):
    winnings = 0
    for i in range(n_runs):
        winnings += -1

    return (winnings/n_runs)                      
    
test_runs = 10000000
print("Estimating for", test_runs, "runs...")
print(estimate_average_slot_payout(test_runs))

