package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by jt on 6/17/17.
 */
public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
        String description = "This is a description";

        category.setDescription(description);

        assertEquals(description, category.getDescription());
    }

    @Test
    public void getRecipes() throws Exception {
        Recipe recipe = new Recipe();
        Ingredient ingredient = new Ingredient();
        ingredient.setDescription("salt");
        recipe.addIngredient(ingredient);
        Set<Recipe> recipeSet = new HashSet<>();
        recipeSet.add(recipe);
        category.setRecipes(recipeSet);
        assertEquals(recipeSet, category.getRecipes());
    }

}