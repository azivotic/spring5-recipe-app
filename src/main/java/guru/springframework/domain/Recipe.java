package guru.springframework.domain;

import org.springframework.data.annotation.Id;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Aleksandar Zivotic
 */
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String description;

    private Integer prepTIme;

    private Integer cookTime;

    private Integer servings;

    private String source;

    private String url;

    private String directions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;


    /**
     * Gets url.
     *
     * @return Value of url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets source.
     *
     * @return Value of source.
     */
    public String getSource() {
        return source;
    }

    /**
     * Gets Id.
     *
     * @return Value of Id.
     */
    public Long getId() {
        return Id;
    }

    /**
     * Sets new prepTIme.
     *
     * @param prepTIme New value of prepTIme.
     */
    public void setPrepTIme(Integer prepTIme) {
        this.prepTIme = prepTIme;
    }

    /**
     * Sets new image.
     *
     * @param image New value of image.
     */
    public void setImage(Byte[] image) {
        this.image = image;
    }

    /**
     * Sets new directions.
     *
     * @param directions New value of directions.
     */
    public void setDirections(String directions) {
        this.directions = directions;
    }

    /**
     * Gets prepTIme.
     *
     * @return Value of prepTIme.
     */
    public Integer getPrepTIme() {
        return prepTIme;
    }

    /**
     * Gets servings.
     *
     * @return Value of servings.
     */
    public Integer getServings() {
        return servings;
    }

    /**
     * Gets notes.
     *
     * @return Value of notes.
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets new source.
     *
     * @param source New value of source.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Gets cookTime.
     *
     * @return Value of cookTime.
     */
    public Integer getCookTime() {
        return cookTime;
    }

    /**
     * Sets new description.
     *
     * @param description New value of description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets new Id.
     *
     * @param Id New value of Id.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Gets image.
     *
     * @return Value of image.
     */
    public Byte[] getImage() {
        return image;
    }

    /**
     * Sets new notes.
     *
     * @param notes New value of notes.
     */
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    /**
     * Sets new servings.
     *
     * @param servings New value of servings.
     */
    public void setServings(Integer servings) {
        this.servings = servings;
    }

    /**
     * Gets ingredients.
     *
     * @return Value of ingredients.
     */
    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    /**
     * Sets new cookTime.
     *
     * @param cookTime New value of cookTime.
     */
    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    /**
     * Gets description.
     *
     * @return Value of description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets directions.
     *
     * @return Value of directions.
     */
    public String getDirections() {
        return directions;
    }

    /**
     * Sets new ingredients.
     *
     * @param ingredients New value of ingredients.
     */
    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Sets new url.
     *
     * @param url New value of url.
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
