#재귀 함수
def recursive_function(i):
    if i == 10:
        return
    recursive_function(i + 1)
    print(i)

recursive_function(1)

#팩토리안 함수
def factorial_function(n):
    if n <= 1:
        return 1
    return n * factorial_function(n-1)

print(factorial_function(4))
