import time
current_time = time.localtime()
print(current_time, "\n")

formatted_time = time.strftime("%Y-%m-%d %H:%M:%S", current_time)
print(formatted_time, "\n")

formatted_time = time.strftime("%d-%m-%Y %H:%M", current_time)
print(formatted_time, "\n")

# Solution as follows
formatted_time = time.strftime("%dth %B %Y, %I:%M %p", current_time)
print(formatted_time)