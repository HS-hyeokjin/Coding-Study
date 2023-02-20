from collections import deque

queue = deque()

queue.append(5)
queue.append(3)
queue.append(7)   # 5 3 7
queue.popleft()   # 3 7
queue.append(9)
queue.append(1)   # 3 7 9 1
queue.popleft()   # 7 9 1

print(queue)
queue.reverse()
print(queue)

