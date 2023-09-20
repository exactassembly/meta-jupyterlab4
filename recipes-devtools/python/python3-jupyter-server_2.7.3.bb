
SUMMARY = "The backend—i.e. core services, APIs, and REST endpoints—to Jupyter web applications."
HOMEPAGE = "https://jupyter-server.readthedocs.io/"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=083556a9912a35360dae8281fb57e886"

SRC_URI[sha256sum] = "d4916c8581c4ebbc534cebdaa8eca2478d9f3bfdd88eae29fcab0120eac57649"

PYPI_PACKAGE = "referencing"

DEPENDS += "\
    ${PYTHON_PN}-hatch-vcs-native \
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-anyio \
    ${PYTHON_PN}-argon2-cffi \ 
    ${PYTHON_PN}-jinja2 \
    ${PYTHON_PN}-jupyter-client \
    ${PYTHON_PN}-jupyter-core \
    ${PYTHON_PN}-jupyter-events \
    ${PYTHON_PN}-jupyter-server-terminals \
    ${PYTHON_PN}-nbconvert \
    ${PYTHON_PN}-nbformat \
    ${PYTHON_PN}-overrides \
    ${PYTHON_PN}-packaging \
    ${PYTHON_PN}-prometheus-client \
    ${PYTHON_PN}-pyzmq \
    ${PYTHON_PN}-send2trash \
    ${PYTHON_PN}-terminado \
    ${PYTHON_PN}-tornado \
    ${PYTHON_PN}-traitlets \
    ${PYTHON_PN}-websocket-client \
"

BBCLASSEXTEND = "native nativesdk"