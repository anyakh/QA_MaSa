

def rep(c, pal):
    pal = pal.replace(c, '')
    pal = pal.lower()
    return pal
def printing(usl, pos, neg): 
    if usl == True:
        print(pos)
    else:
        print(neg)
def task1(): # Напишите функцию, которая определяет, является ли слово палиндромом
    palindrom1 = input('введите палиндром: ')
    palindrom1 = rep(',', palindrom1)
    palindrom1 = rep('.', palindrom1)
    palindrom1 = rep('!', palindrom1)
    palindrom1 = rep('?', palindrom1)
    palindrom1 = rep(' ', palindrom1)
    
    printing(bool(palindrom1 == palindrom1[-1::-1]), 'Вы ввели палиндром', 'Вы ввели не палиндром')


def factorial(x):
    fac = 1
    for i in range(1, (x +1) ):
        fac = fac * i
    return fac
def task2(): # ØНапишите функцию, которая вычисляет факториал числа (n!).
    num = (int)(input('введите число факториал которого вы хотите получить: '))
    f = factorial(num) 
    print(f)
    

# Напишите функцию, которая проверяет, 
# является ли число простым (имеет только два делителя: 1 и само число).

def prost(num):
    d = 2
    while num%d != 0:
        d +=1
    return d
        
def task3():
    number = (int)(input('Введите число '))
    d = prost(number)
    printing(bool(d == number), f'{number} - простое число', f'{number} - не простое число')
    


def square(num):
    sq = num *num
    return sq
def task4():
    # Напишите функцию, которая принимает список чисел и возвращает новый список,
# содержащий квадраты элементов исходного списка.
    spisok1 = []
    spisok2 = []
    n = (int)(input("введите количество чисел в списке: "))
    for i in range(n):
        chislo = (int)(input('Введите число: '))
        spisok1.append(chislo)
        spisok2.append(square(chislo))
    print(" ", spisok1, "\n", spisok2)



# Напишите функцию, которая принимает список слов и возвращает новый список, 
# содержащий только слова с четным количеством букв.
def spiski(c):
    spisk = []
    k = (int)(input(f'Enter number of {c}: '))
    for i in range(k):
      spisk.append(input(f'Enter {c}: '))
    return spisk

def slova(words):
    
    for i in words:
        if len(i)%2 != 0:
            words.remove(i) 
    return words

def task5():
    word = spiski('words ')
    print(slova(word))
    


def table(num):
    i = 1
    print(f'Таблица умножения на {num}')
    while i < 10:
        print(f'{num} * {i} = {num*i}')
        i+=1
        
def task6(): # Напишите функцию, которая принимает число n и выводит таблицу умножения от 1 до n
    n = (int)(input("введите число для которого хотите получить таблицу умножения: "))
    table(n)
    
def unique(spisok):
    new_spisok = []
    for i in spisok:
        if i not in new_spisok:
            new_spisok.append(i)
    return new_spisok

def task7():
    spisok1 = spiski('numbers ')
    print(unique(spisok1))
   

def choose_task(x):
    match x:
        case 1: task1()
        case 2: task2()
        case 3: task3()
        case 4: task4()
        case 5: task5()
        case 6: task6()
        case 7: task7()
number_of_the_task = 1
while number_of_the_task != 0: 
    number_of_the_task = (int)(input('Введите номер задания которое хотите воспроизвести: \n0 - если хотите выйти \n1 - Палиндром \n2 - Факториал \n3 - Проверка на простое число \n4 - Список квадратов \n5 - Проверка слова на четность букв \n6 - Таблица умножения \n7 - Уникальные числа \n'))
    choose_task(number_of_the_task)