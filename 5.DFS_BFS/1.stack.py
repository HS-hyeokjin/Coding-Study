stack = []

stack.append(5)
stack.append(3)
stack.append(8)  # 5 3 8
stack.pop()      # 5 3
stack.append(7)  # 5 3 7
stack.pop()
stack.pop()      # 5
stack.append(2)  # 5 2

print(stack)
print(stack[::-1])
