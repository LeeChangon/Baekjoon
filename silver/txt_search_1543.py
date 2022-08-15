def find_word(txt, word):
    count = 0
    i = 0
    while len(txt[i:len(word)+i]) >= len(word):
        if txt[i:len(word)+i] == word:
            count += 1
            i += len(word)
        else:
            i += 1
    print(count)

txt = input()
word = input()
find_word(txt, word)

        