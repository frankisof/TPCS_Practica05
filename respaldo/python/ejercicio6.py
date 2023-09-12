a = "juan"
length = len(a)
print(length)
print('\n')
b = "it's ok"
length =len(b)
print(length)
print('\n')
c = 'it\'s ok'
length = len(c)
print(length)
print('\n')
d = """hey"""
length = len(d)
print(d)
print('\n')
e = "mario hugo"
length = len(e)
print(length)
print('\n')
def is_valid_zip(zip_code):
    return (len(zip_code)==5 and zip_code.isdigit())
print(is_valid_zip("12345"))
print('\n')
lista=["mario","juam", "francisco"]
key="12345"
def word_search(doc_list, keyword):
    list=["juan", "coca", "kangreburguer"]
    for statement,phrase in enumerate(doc_list):
        phrase=phrase.split()
        if keyword.lower() in [word.rstrip('.,').lower() for word in phrase]:
            list.append(statement)
    return list
print(word_search(lista, key))

print('\n')
lista1=["perros", "gatos"]
keyw="12345"
def multi_word_search(doc_list, keywords):
    indices={}
    for keyword in keywords:
        indices[keyword]=word_search(doc_list,keyword)
    return indices
print(multi_word_search(lista1, keyw))

