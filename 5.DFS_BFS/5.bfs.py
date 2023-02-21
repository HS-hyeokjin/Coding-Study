from collections import deque

def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True
    while queue:
        #큐에서 하나의 원소를 뽑아 출력
        v = queue.popleft()
        print(v, end=' ')
        #방문하지 않은 인접한 원소들을 큐에 삽입
        for i in graph[v]:
            print(v)
            if not visited[i]:
                queue.append(i)
                visited[i]  =True

#그래프를 2차원으로 표현
graph = [
    [],
    [2, 3, 6],    # 1과 인접한 노드
    [1, 4, 5],    # 2와 인접한 노드
    [1, 6],       # 3과 인접한 노드
    [2, 8, 9],    # 4와 인접한 노드
    [2, 7],       # 5와 인접한 노드
    [1, 3],       # 6과 인접한 노드
    [5],          # 7과 인접한 노드
    [4],          # 8과 인접한 노드
    [4]           # 9와 인접한 노드
]

visited = [False] * 10

bfs(graph, 1, visited)
