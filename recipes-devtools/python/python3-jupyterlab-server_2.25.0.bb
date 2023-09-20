SUMMARY = "A set of server components for JupyterLab and JupyterLab like applications."
HOMEPAGE = "https://jupyterlab-server.readthedocs.io/"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://.licenserc.yaml;md5=3f563378df9ddebfd3577f745aabfe0e"

SRC_URI[sha256sum] = "77c2f1f282d610f95e496e20d5bf1d2a7706826dfb7b18f3378ae2870d272fb7"

PYPI_PACKAGE = "jupyterlab_server"

DEPENDS += "\
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-babel \
    ${PYTHON_PN}-jinja2 \
    ${PYTHON_PN}-json5 \
    ${PYTHON_PN}-jsonschema \
    ${PYTHON_PN}-jupyter-server \
    ${PYTHON_PN}-packaging \
    ${PYTHON_PN}-requests \
"