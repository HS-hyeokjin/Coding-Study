def dfs(graph, v, visited):
    # 노드 방문 처리
    visited[v] = True
    print(v, end=' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

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

# 각 노드 정보를 False 로 표현
visited = [False] * 10

dfs(graph, 1, visited)
