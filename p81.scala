object p81 {

  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def decrypt(text: String, shift: Int): String = {
    encrypt(text, -shift)
  }

  def cipher(text: String, shift: Int, algo: (String, Int) => String): String = {
    algo(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted Text: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted Text: $decryptedText") 
  }
}
