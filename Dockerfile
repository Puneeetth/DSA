#Dockerfile
FROM python:3.11-slim

#set environment variables
ENV PYTHONDONTWRITEBYTECODE 1
ENV PYTHONUNBUFFERED 1

#set work directory
WORKDIR /app

#copy requirements & install
COPY requirements.txt .
RUN pip install --upgrade pip 
RUN pip install -r requirements.txt

#copy the rest of the app
COPY . .

#run dev server
CMD [ "python","manage.py","runserver","0.0.0.0:8000" ]