#!/bin/bash

if [ ! -d "task" ]; then
  mkdir task
fi
cd task

if [ ! -d "about_me" ] && [ ! -d "favorites" ]; then
  mkdir about_me favorites
fi

name="Ni Wayan Amanda Putri Astawa"
echo $name > about_me/about_me.txt

touch favorites/food.txt favorites/drinks.txt

favorite_food="Canai"
favorite_drink="Es Kopi Tarik"

echo $favorite_food > favorites/food.txt
echo $favorite_drink > favorites/drinks.txt

if ! command -v tree &> /dev/null
then
    sudo apt-get install -y tree
fi

tree
