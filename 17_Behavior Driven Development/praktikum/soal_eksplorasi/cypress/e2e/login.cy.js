describe('Login', () => {
    it('As a user I can login with valid credentials', () => {
      cy.visit('https://www.sepulsa.com/signin')
      cy.get('input[name="email"]').type('your_valid_email@example.com')
      cy.get('input[name="password"]').type('your_valid_password')
      cy.contains('Masuk').click()
      cy.location('host').should('eq', 'www.sepulsa.com')
    })
  
    it('As a user I cannot login with invalid credentials', () => {
      cy.visit('https://www.sepulsa.com/signin')
      cy.get('input[name="email"]').type('invalid_email@example.com')
      cy.get('input[name="password"]').type('invalid_password')
      cy.contains('Masuk').click()
      cy.get('.section-plnwarning').should('be.visible')
      cy.get('#alert_description').should('be.visible').and('contain', 'Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih.')
    })
  
    it('As a user I cannot login with empty fields', () => {
      cy.visit('https://www.sepulsa.com/signin')
      cy.contains('Masuk').should('be.disabled')
    })
  })
  