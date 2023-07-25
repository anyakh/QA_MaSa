#Необходимо написать программу, которая проверяет, если фраза введённая
#пользователем является палиндромом. Например:
#Ася, молоко около мяса. палиндром

# palindrom1 = input('введите палиндром: ')
# palindrom1 = palindrom1.replace(' ', '')
# palindrom1 = palindrom1.replace(',', '')
# palindrom1 = palindrom1.replace('.', '')
# palindrom1 = palindrom1.replace('!', '')
# palindrom1 = palindrom1.replace('?', '')
# palindrom1 = palindrom1.lower()
# print(palindrom1)
# mardnilap = palindrom1[-1::-1]
# print(mardnilap)
# if palindrom1 == mardnilap:
#     print("Поздравляю вы ввели палиндром!")
# else:
#     print("Вы ввели не палиндром :( ")

#Удалите в строке ' a b c d e f ' все пробелы и выведите результат на экран

'''letters = ' a b c d e f '
print(letters.replace(' ', '')) '''


#Рассчитать стоимость покупки с учетом скидки в
#35 %, которая
#предоставляется покупателю, если сумма покупки превышает 20 шек.
#Сумма покупки вводится пользователем.

'''sum = (int)(input('Введите стоимость покупки (в шекелях): '))
while sum<0:
    sum = (int)(input('Стоимость покупки не может быть отрицательна. Введите стоимость покупки (в шекелях): '))
if sum > 20:
    print(f'Окончательная стоимость покупки со скидкой: {(int)(sum*0.65)} шекелей')
else:
    print(f'Окончательная стоимость покупки: {sum} шекелей')'''

#Посчитайте количество символов в строке 'Python - это Питон!',
#использовав счетчики на основе циклов for и while

'''phrase = 'Python - это Питон!'
print(f'actual length: {len(phrase)}') #проверка
count = 0
for x in phrase:
    count+=1
print(f'length counted with the help of for: {count}')
while count < len(phrase):
    count+=1
print(f'length counted with the help of while: {count}')'''

'''Напишите скрипт, который будет проверять пользователя на умение
перемножать однозначное натуральное число на двузначное, запрашивая
ввод ответа с клавиатуры. Результат проверки ответа пользователя должен
выводиться на экран в виде соответствующего сообщения. В случае
неправильного ответа, программа должна выводить сообщение об ошибке,
дополнительно сообщая пользователю верный результат. Для получения
случайных целых чисел из диапазона 2 99 импортируйте из модуля
random стандартной библиотеки метод randrange.'''
import random
i = -1
while i == -1:
    single_digit_num = (int)(random.randrange(2,99))
    single_digit_num = (int)(single_digit_num/10)
    double_digit_num = (int)(random.randrange(2,99))
    print(f'Перемножте однозначное натуральное число {single_digit_num} на двузначное {double_digit_num}')
    result = (int)(input('Результат: '))
    right_result = single_digit_num*double_digit_num
    if result == right_result:
       print("Ваш ответ верный!")
       i = 0
    else:
        print(f"Ваш ответ неверный, правильный ответ: {right_result}")
        i = -1
