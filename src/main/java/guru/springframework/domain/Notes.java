package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 * @author Aleksandar Zivotic
 */
@Entity
public class Notes {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    /**
     * Sets new id.
     *
     * @param id New value of id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Sets new recipeNotes.
     *
     * @param recipeNotes New value of recipeNotes.
     */
    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }

    /**
     * Gets recipeNotes.
     *
     * @return Value of recipeNotes.
     */
    public String getRecipeNotes() {
        return recipeNotes;
    }

    /**
     * Sets new recipe.
     *
     * @param recipe New value of recipe.
     */
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    /**
     * Gets id.
     *
     * @return Value of id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Gets recipe.
     *
     * @return Value of recipe.
     */
    public Recipe getRecipe() {
        return recipe;
    }
}
