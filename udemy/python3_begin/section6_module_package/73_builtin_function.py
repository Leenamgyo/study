import builtins

# 내장함수 목록
builtins.print()

ranking = {
    'A': 100,
    'B': 85,
    'C': 95
}

# ranking.get('A')
print(sorted(ranking, key=ranking.get, reverse=True))
