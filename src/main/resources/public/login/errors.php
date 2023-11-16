<?php $errors = array(); ?>

<?php if (count($errors) > 0) : ?>
    <div class="error"> <!-- Corrected the opening div tag -->
        <?php foreach($errors as $error) : ?>
            <p><?php echo $error ?></p>
        <?php endforeach; ?>
    </div>
<?php endif ?>
