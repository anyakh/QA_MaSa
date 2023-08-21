# Написать функцию square, принимающую 1 аргумент - сторону квадрата, и возвращающую 3 значения 
# (с помощью кортежа): периметр квадрата, площадь квадрата и диагональ квадрата.

def square(a):
    return (a*4, a*a, round(a*2**(0.5), 2))
def task1():
    print(square((int)(input('Введите сторону квадрата: '))))

# ØНаписать функцию season, принимающую 1 аргумент — номер месяца (от 1 до 12),
# и возвращающую время года, которому этот месяц принадлежит (зима, весна, лето или осень).

def season(num):
    x = 1
    while x == 1:
        x = 2
        if num in [1, 12 ,2]:
            return 'Зима'
        if num in [3, 4, 5]:
            return 'Весна'
        if num in [6, 7, 8]:
            return 'Лето'
        if num in [9, 10, 11]:
            return 'Осень'
        elif num not in range(1,13):
            x = 1
            print('Такого месяца нет, введите существующий месяц: ')
            num = (int)(input('Введите номер месяца: '))
            
def task2():
    print(season((int)(input('Введите номер месяца: '))))

# Пользователь делает вклад в размере a рублей сроком на years лет под 10% годовых 
# (каждый год размер его вклада увеличивается на 10%. Эти деньги прибавляются к сумме вклада, 
# и на них в следующем году тоже будут проценты). Написать функцию bank, 
# принимающая аргументы a и years, и возвращающую сумму, которая будет на счету пользователя.
        

def bank(a, years):
    for i in range(years):
        a = a*1.1
    return round(a, 2)
def task3():
    print(bank((float)(input('Введите сумму вклада ')), (int)(input('Введите количество лет '))))

# Напишите функцию change(lst), которая принимает список и меняет местами его первый и последний элемент.
# В исходном списке минимум 2 элемента.  

def change(lst):
    first = lst[0]
    second = lst[len(lst) - 1]
    lst.remove(first)
    lst.remove(second)
    lst.insert(0, second)
    lst.insert(len(lst), first)
    return lst
def task4():
    lst = []
    e = 1
    while e < 2: 
        e = (int)(input('Введите число элементов (больше 2) '))        
    for i in range(e):
        lst.append(input('Введите элемент списка '))
    print(change(lst))
    
# Иван решил создать самый большой словарь в мире. Для этого он придумал функцию biggest_dict(**kwargs), 
# которая принимает неограниченное количество параметров «ключ:
# значение» и обновляет созданный им словарь my_dict, 
# состоящий всего из одного элемента «first_one» со значением «we can do it». Воссоздайте эту функцию

my_dict = {'first_one':'we can do it'}

def biggest_dict(**kwargs):
    my_dict.update(**kwargs)
    for key, value in my_dict.items():
        print(f'{key} : {value}')
    print()
    
def task5():
    biggest_dict(lena = 47, vadim = 47, zoya = 24, vanya = 32)
    biggest_dict(height=178, name1='John', age1=31, weight1=66, eyes_color1='grey')
    biggest_dict(lang1='Python', lang2='Java', lang3='C++')
    print(my_dict)


# Создайте функцию three_args(), которая принимает 1, 2 или 3 строго ключевых параметра. 
# В результате ее работы на печать в консоль выводятся значения переданных переменных, 
# но только если они не равны None. 
# Получим, например, следующее сообщение: Переданы аргументы: var1 = 2, var3 = 10.

