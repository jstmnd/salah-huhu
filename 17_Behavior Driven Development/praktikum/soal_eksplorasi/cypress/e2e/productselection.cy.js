describe('Product Selection', () => {
    it('As a user I can select product', () => {
      cy.visit('https://www.sepulsa.com/transaction/checkout')
      cy.visit('https://www.sepulsa.com/signin')
      cy.get('input[name="email"]').type('putrimanda985@gmail.com')
      cy.get('input[name="password"]').type('220703Amanda_')
      cy.contains('Masuk').click()
      cy.location('host').should('eq', 'www.sepulsa.com')
      cy.wait(5000)
      cy.contains('Lainnya').click()
      cy.url().should('include', '/menu')
      cy.contains('p', 'Telekomunikasi').scrollIntoView().click() 
      cy.get('#product_type_0').click()
    })
    
    it('As a user I cannot select unavailable product', () => {
      cy.visit('https://www.sepulsa.com/transaction/checkout')
      cy.visit('https://www.sepulsa.com/signin')
      cy.get('input[name="email"]').type('putrimanda985@gmail.com')
      cy.get('input[name="password"]').type('220703Amanda_')
      cy.contains('Masuk').click()
      cy.location('host').should('eq', 'www.sepulsa.com')
      cy.wait(5000)
      cy.contains('Lainnya').click()
      cy.url().should('include', '/menu')
      cy.contains('p', 'Telekomunikasi').scrollIntoView().click()
      cy.get('#product_type_0').click() 
      cy.get('.product-base').within(() => {
      cy.get('.MuiGrid-item').each(($option) => {
          const isAvailable = $option.find('.unavailable-option').length === 0
          if (!isAvailable) {
            throw new Error('One or more options for the product are unavailable')
          }
        })
      })  
    })
  })  