# Administration Menu

The Administration Menu module displays the entire administrative menu tree
(and most local tasks) in a drop-down menu, providing administrators one- or
two-click access to most pages.

For a full description of the module, visit the
[project page](https://www.drupal.org/project/admin_menu).

Submit bug reports and feature suggestions, or track changes in the
[issue queue](https://www.drupal.org/project/issues/admin_menu).


## Table of contents

- Requirements
- Recommended modules
- Installation
- Configuration
- Troubleshooting
- FAQ
- Maintainers


## Troubleshooting

If the menu does not display, check the following:

- Are the "Access administration menu" and "Use the administration pages and
  help" permissions enabled for the appropriate roles?
- Does html.tpl.php of your theme output the `$page_bottom` variable?


## FAQ

**Q: I want to prevent robots from indexing my custom error pages by
setting the robots meta tag in the HTML head to "noindex".**

**A:** There is no need to. **Customerror** returns the correct HTTP
status codes (403 and 404). This will prevent robots from indexing the
error pages.

**Q: I want to customize the custom error template output.**

**A:** In your theme template folder for your site, copy the template
provided by the **Customerror** module
(i.e. `templates/customerror.html.twig`) and then make your
modifications there.

**Q: I want to have a different template for my 404 and 403 pages.**

**A:** Copy `customerror.html.twig` to
`customerror--404.html.twig` and `customerror--403.html.twig`. You
do not need a `customerror.html.twig` for this to work.
