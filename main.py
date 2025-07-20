# datetime 모듈
import datetime

now = datetime.datetime.now()

# 특정 시간 이후의 시간 구하기
print("# datetime.timedelta로 시간 더하기")
after = now + datetime.timedelta(\
    weeks=1,\
    days=1,\
    hours=1,\
    minutes=1,\
    seconds=1)
print(after.strftime(f"%Y년 %m월 %y일 %H시 %M분 %S초"))