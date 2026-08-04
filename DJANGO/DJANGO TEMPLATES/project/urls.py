from django.contrib import admin
from django.urls import path

from project.controller.indexController import home


urlpatterns = [
    path('', home),
    path('admin/', admin.site.urls),
]
